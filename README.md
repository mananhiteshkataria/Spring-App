# Spring-App
## Dependency Injection between the objects with simple and complex types ##
#### You can have setter methods to supply the dependencies of simple or complex type ####

	Class MySQLDBImpl implements DBOperations
	{
		private String dbUrl;//simple type
	}
	
	class UserService
	{
		private DBOperation dbop;
	}
	
	<bean id="b1" class="com.practise.MySqlDBImpl">
		<property name="dbUrl" value ="jdbc:mysql://localhost:3306"/>
	</bean>
	
	<bean id="b2" class="com.practise.UserService">
		<property name="dbop" ref="b1" />
	</bean>
