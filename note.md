## 注解说明
@Autowired：spring提供，自动装配通过先查名字在查类型
@Qualifier（value="xxx"）通过id装配
@Nullable: 字段标记了这个注解，说明这个字段可以为null
@Resource: java提供的自动装配，先查类型再查名字
@Component： 组件，放在类上，说明这个类被Spring容器管理了