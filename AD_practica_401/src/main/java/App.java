import dao.TeacherDao;

public class App {

    public static void main(String[] args) {
        TeacherDao teacherDao = new TeacherDao();
        System.out.println(teacherDao.find(1));
    }
}

// RESULTADO:
/*
C:\Users\149FA06\.jdks\openjdk-26.0.2.1\bin\java.exe "-javaagent:C:\Users\149FA06\AppData\Local\Programs\IntelliJ IDEA\lib\idea_rt.jar=57634" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\149FA06\Desktop\Practica_4_AD\AD_practica_401\target\classes;C:\Users\149FA06\.m2\repository\org\hibernate\orm\hibernate-core\6.1.7.Final\hibernate-core-6.1.7.Final.jar;C:\Users\149FA06\.m2\repository\jakarta\persistence\jakarta.persistence-api\3.0.0\jakarta.persistence-api-3.0.0.jar;C:\Users\149FA06\.m2\repository\jakarta\transaction\jakarta.transaction-api\2.0.0\jakarta.transaction-api-2.0.0.jar;C:\Users\149FA06\.m2\repository\org\jboss\logging\jboss-logging\3.4.3.Final\jboss-logging-3.4.3.Final.jar;C:\Users\149FA06\.m2\repository\org\hibernate\common\hibernate-commons-annotations\6.0.6.Final\hibernate-commons-annotations-6.0.6.Final.jar;C:\Users\149FA06\.m2\repository\org\jboss\jandex\2.4.2.Final\jandex-2.4.2.Final.jar;C:\Users\149FA06\.m2\repository\com\fasterxml\classmate\1.5.1\classmate-1.5.1.jar;C:\Users\149FA06\.m2\repository\net\bytebuddy\byte-buddy\1.12.18\byte-buddy-1.12.18.jar;C:\Users\149FA06\.m2\repository\jakarta\xml\bind\jakarta.xml.bind-api\3.0.1\jakarta.xml.bind-api-3.0.1.jar;C:\Users\149FA06\.m2\repository\com\sun\activation\jakarta.activation\2.0.1\jakarta.activation-2.0.1.jar;C:\Users\149FA06\.m2\repository\jakarta\inject\jakarta.inject-api\2.0.0\jakarta.inject-api-2.0.0.jar;C:\Users\149FA06\.m2\repository\org\antlr\antlr4-runtime\4.10.1\antlr4-runtime-4.10.1.jar;C:\Users\149FA06\.m2\repository\org\glassfish\jaxb\jaxb-runtime\4.0.9\jaxb-runtime-4.0.9.jar;C:\Users\149FA06\.m2\repository\org\glassfish\jaxb\jaxb-core\4.0.9\jaxb-core-4.0.9.jar;C:\Users\149FA06\.m2\repository\jakarta\activation\jakarta.activation-api\2.1.4\jakarta.activation-api-2.1.4.jar;C:\Users\149FA06\.m2\repository\org\eclipse\angus\angus-activation\2.0.3\angus-activation-2.0.3.jar;C:\Users\149FA06\.m2\repository\org\glassfish\jaxb\txw2\4.0.9\txw2-4.0.9.jar;C:\Users\149FA06\.m2\repository\com\sun\istack\istack-commons-runtime\4.1.2\istack-commons-runtime-4.1.2.jar;C:\Users\149FA06\.m2\repository\org\mariadb\jdbc\mariadb-java-client\3.3.3\mariadb-java-client-3.3.3.jar;C:\Users\149FA06\.m2\repository\com\github\waffle\waffle-jna\3.3.0\waffle-jna-3.3.0.jar;C:\Users\149FA06\.m2\repository\net\java\dev\jna\jna\5.13.0\jna-5.13.0.jar;C:\Users\149FA06\.m2\repository\net\java\dev\jna\jna-platform\5.13.0\jna-platform-5.13.0.jar;C:\Users\149FA06\.m2\repository\org\slf4j\jcl-over-slf4j\2.0.7\jcl-over-slf4j-2.0.7.jar;C:\Users\149FA06\.m2\repository\org\slf4j\slf4j-api\2.0.7\slf4j-api-2.0.7.jar;C:\Users\149FA06\.m2\repository\com\github\ben-manes\caffeine\caffeine\2.9.3\caffeine-2.9.3.jar;C:\Users\149FA06\.m2\repository\com\google\errorprone\error_prone_annotations\2.10.0\error_prone_annotations-2.10.0.jar;C:\Users\149FA06\.m2\repository\org\checkerframework\checker-qual\3.32.0\checker-qual-3.32.0.jar;C:\Users\149FA06\.m2\repository\jakarta\validation\jakarta.validation-api\3.0.2\jakarta.validation-api-3.0.2.jar App
oct 27, 2026 8:08:01 P. M. org.hibernate.jpa.internal.util.LogHelper logPersistenceUnitInformation
INFO: HHH000204: Processing PersistenceUnitInfo [name: default]
oct 27, 2026 8:08:01 P. M. org.hibernate.Version logVersion
INFO: HHH000412: Hibernate ORM core version 6.1.7.Final
oct 27, 2026 8:08:01 P. M. org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl configure
WARN: HHH10001002: Using built-in connection pool (not intended for production use)
oct 27, 2026 8:08:01 P. M. org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
INFO: HHH10001005: Loaded JDBC driver class: org.mariadb.jdbc.Driver
oct 27, 2026 8:08:01 P. M. org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
INFO: HHH10001012: Connecting with JDBC URL [jdbc:mariadb://localhost:3306/ad_aulavirtual]
oct 27, 2026 8:08:01 P. M. org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
INFO: HHH10001001: Connection properties: {user=root, password=****}
oct 27, 2026 8:08:01 P. M. org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
INFO: HHH10001003: Autocommit mode: false
oct 27, 2026 8:08:01 P. M. org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl$PooledConnections <init>
INFO: HHH10001115: Connection pool size: 20 (min=1)
SLF4J: No SLF4J providers were found.
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See https://www.slf4j.org/codes.html#noProviders for further details.
oct 27, 2026 8:08:01 P. M. org.hibernate.engine.jdbc.dialect.internal.DialectFactoryImpl logSelectedDialect
INFO: HHH000400: Using dialect: org.hibernate.dialect.MariaDBDialect
oct 27, 2026 8:08:01 P. M. org.hibernate.cfg.beanvalidation.TypeSafeActivator getValidatorFactory
INFO: Error calling `jakarta.validation.Validation#buildDefaultValidatorFactory`
jakarta.validation.NoProviderFoundException: Unable to create a Configuration, because no Jakarta Bean Validation provider could be found. Add a provider like Hibernate Validator (RI) to your classpath.
	at jakarta.validation.Validation$GenericBootstrapImpl.configure(Validation.java:291)
	at jakarta.validation.Validation.buildDefaultValidatorFactory(Validation.java:103)
	at org.hibernate.cfg.beanvalidation.TypeSafeActivator.getValidatorFactory(TypeSafeActivator.java:479)
	at org.hibernate.cfg.beanvalidation.TypeSafeActivator.activate(TypeSafeActivator.java:82)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.hibernate.cfg.beanvalidation.BeanValidationIntegrator.integrate(BeanValidationIntegrator.java:137)
	at org.hibernate.internal.SessionFactoryImpl.<init>(SessionFactoryImpl.java:287)
	at org.hibernate.boot.internal.SessionFactoryBuilderImpl.build(SessionFactoryBuilderImpl.java:415)
	at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.build(EntityManagerFactoryBuilderImpl.java:1423)
	at org.hibernate.jpa.HibernatePersistenceProvider.createEntityManagerFactory(HibernatePersistenceProvider.java:55)
	at jakarta.persistence.Persistence.createEntityManagerFactory(Persistence.java:80)
	at jakarta.persistence.Persistence.createEntityManagerFactory(Persistence.java:55)
	at dao.Dao.<init>(Dao.java:9)
	at dao.TeacherDao.<init>(TeacherDao.java:6)
	at App.main(App.java:6)

oct 27, 2026 8:08:02 P. M. org.hibernate.resource.transaction.backend.jdbc.internal.DdlTransactionIsolatorNonJtaImpl getIsolatedConnection
INFO: HHH10001501: Connection obtained from JdbcConnectionAccess [org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator$ConnectionProviderJdbcConnectionAccess@4b74b35] for (non-JTA) DDL execution was not in auto-commit mode; the Connection 'local transaction' will be committed and the Connection will be set into auto-commit mode.
Hibernate: create table Course (id integer not null auto_increment, title varchar(255), teacher_id integer not null, primary key (id)) engine=InnoDB
Hibernate: create table Teacher (id integer not null auto_increment, firstName varchar(255), lastName varchar(255), primary key (id)) engine=InnoDB
Hibernate: alter table Course add constraint FK90kt2haj2fb3guifaq4rgy8m4 foreign key (teacher_id) references Teacher (id)
oct 27, 2026 8:08:02 P. M. org.hibernate.engine.transaction.jta.platform.internal.JtaPlatformInitiator initiateService
INFO: HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
Hibernate: select t1_0.id,t1_0.firstName,t1_0.lastName from Teacher t1_0 where t1_0.id=?
null

Process finished with exit code 0
 */