# TODO

- [ ] Spring Tool Suite对protobuf的支持不好
  - [ ] Eclipse的gradle插件不会自动的将protobuf的目录加到**.classpath**文件，需要手动执行
  		- `gradle generateProto`生产pb代码
  		- `gradle eclipse`更新classpath 将生产的代码路径添加到classpath中
- [x] IDEA的支持很好 可以自动识别到生成的代码
  - [ ] `gradle idea`可以直接生成Intellij IDEA项目工程文件
- [x] VS Code 使用 Eclipse LS,但是却可以正确的将生成目录识别到