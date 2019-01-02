from pathlib import Path
from typing import Optional


class ClassGenerator:

    def __init__(self, current_dir: Path, package_name: str, class_name: str, method_num: int,
                 prev_class_name: Optional[str]):
        self.dir = current_dir
        self.package_dir = current_dir / package_name
        self.class_name = class_name
        self.method_num = method_num
        self.prev_class_name = prev_class_name

    def get_package_name(self):
        ls = list(self.package_dir.parts)
        java_index = ls.index("java")
        return ".".join(ls[java_index + 1:])

    def write_class_file(self):
        self.package_dir.mkdir(parents=True, exist_ok=True)
        file = self.package_dir / (self.class_name + ".kt")
        with file.open("w") as f:
            self.generate_class_text(f)

    def generate_class_text(self, file):
        print("package {package_name}".format(package_name=self.get_package_name()), file=file)
        print("class {class_name} {{".format(class_name=self.class_name), file=file)
        if self.prev_class_name is None:
            print("    fun method0() = Unit", file=file)
        else:
            print("    fun method0() = {prev_class_name}().method{method_num}()".format(
                prev_class_name=self.prev_class_name, method_num=self.method_num), file=file)
        for i in range(self.method_num):
            print("    fun method{num}() = method{prev}()".format(num=i + 1, prev=i), file=file)

        print("}", file=file)


if __name__ == '__main__':
    generator = ClassGenerator(
        Path("../SingleModuleApp/app/src/main/java/com/github/yamamotoj/singlemoduleapp"), "foo",
        "foo", 5, "bar")
    print(generator.get_package_name())
    print(generator.generate_class_text(None))
