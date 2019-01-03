from pathlib import Path

from class_generator import ClassGenerator


def split_list(l, n):
    for idx in range(0, len(l), n):
        yield l[idx:idx + n]


class PackageGenerator:

    def __init__(self, parent_dir: Path, package_start_num: int, package_prefix: str,
                 class_start_num: int, class_num: int, class_prefix: str, method_num: int):
        self.parent_dir = parent_dir
        self.package_start_num = package_start_num
        self.package_prefix = package_prefix
        self.class_start_num = class_start_num
        self.class_num = class_num
        self.class_prefix = class_prefix
        self.method_num = method_num

    def generate_classes(self):
        prev_class = None
        for package_index, package in enumerate(
                split_list(range(self.class_start_num, self.class_start_num + self.class_num),
                           100)):
            package_name = "{}{:0=2}".format(self.package_prefix,
                                             self.package_start_num + package_index)
            for class_index in package:
                class_name = "{}{:0=5}".format(self.class_prefix, class_index)
                print(package_name, class_name)
                class_generator = ClassGenerator(self.parent_dir, package_name, class_name, 5,
                                                 prev_class)
                class_generator.write_class_file()
                prev_class = class_generator



def generateMoudle(app_root:Path, module_num:int ):
    module_name = "module{}".format(module_num)
    src_path = app_root / module_name / "src/main/java/com/github/yamamotoj" / module_name
    generator = PackageGenerator(
        src_path,
        (module_num - 1) * 25, "package",
        (module_num -1) * 2500, 2500, "Foo",
        5)
    generator.generate_classes()


if __name__ == '__main__':
    app_root = Path("/Users/j.yamamoto/Documents/github/android_multi_module_experiment/MultiModuleApp2")
    generateMoudle(app_root, 2)
