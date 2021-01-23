import com.zcp.dao.ItemDao;
import com.zcp.pojo.Items;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
public class testSsmDao {
    @Test
    public void testfindAll() {
        //创建spring的容器对象，怎么创建容器来着
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        //用容器对象调用getbean方法创建一个dao的子实现类对象
        ItemDao itemDao = (ItemDao) applicationContext.getBean("itemDao");
        //用子实现类调用接口中的方法
        List<Items> items = itemDao.findAll();
        System.out.println(items);
    }
    @Test
    public void testUpdate(){
        //创建spring的容器对象，怎么创建容器来着
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        //用容器对象调用getbean方法创建一个dao的子实现类对象
        ItemDao itemDao = (ItemDao) applicationContext.getBean("itemDao");
        Items items = new Items();
        items.setName("你妈的");
        //用子实现类调用接口中的方法
        itemDao.update(items);

    }
}
