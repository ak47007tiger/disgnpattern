package mediator;

/*
 * 封装交互
 * 对象方法调用、传值
 * 编译时确定交互
 * 运行时反射确定交互
 */
public class Mediator {

	public void action1_entity1(){
		System.out.println("行动个体1的行动1");
	}
	public void action1_entity2(String entity, String method){
		System.out.println("行动个体1的行动2");
		System.out.println();
		entity_2.doAction1();
		entity_1.doAction1();
	}
	private ActionEntity_1 entity_1;
	private ActionEntity_2 entity_2;
}
