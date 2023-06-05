package com.gage.api.v1;


import com.gage.spring.IOCStudy.IC;
import com.gage.dto.PersonDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


// 和golang一样 这里java自己实现的

// 导入控制器
// 可以对注解进一步提取  使用restful api的话
//@Controller
//@ResponseBody

// RestController 包含了 @ResponseBody @Controller

// 使用 /v1/banner 作为反爬虫的 宣传
@RestController
//@Lazy
@RequestMapping("/v1/banner")  // 路由表  统一配置管理
public class TestIOCController {


    // 使用responsebody的方式 更加智能

    // 使用属性注入的方式  hero显示被 注入到了容器中  然后由属性进行实例化调用
    // autoaired 进行自动连线调用
    // 使用了this


    //    @Qualifier("heroA")   // 主动注解
    // 在ioc查找都一个 则是 bytype   一个情况 变量怎么命名都可以
    // 两个则比必须  采用标准的驼峰命名
    // 查找到多个  进行 byname 查询
    //    private IC heroB;
    // 属性注入
    // 虽然报红 但不是错  Condition 返回的是 false
    @Autowired
    private IC ic;


    // 构造注入
    //    private HeroA heroA;
    //
    //    @Autowired
    //    public BannerController(HeroA heroA) {
    //        // 这个参数 heroA 是加入ioc容器后实例化的结果  然后进行赋值
    //        this.heroA = heroA;
    //    }

    // setter注入
    //    private HeroA heroA;
    //
    //    @Autowired
    //    public void setHeroA(HeroA heroA) {
    //        // 这里返回的已经是 接口了   具体实例化对象赋值
    //        this.heroA = heroA;
    //    }


//    @GetMapping("/resources")
//    public UnifyResponse res(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "10") Integer count, @RequestParam(defaultValue = "") Integer rid, @RequestParam(defaultValue = "") String name, HttpServletRequest rep) {
//        // 建造者模式
//        PageCounter pageCounter = PageCounter.builder().page(page).count(count).build();
//        Page<ResourceItem> resourceItemList = resourceItemService.getResources(pageCounter.getPage(), pageCounter.getCount(), rid, name);
//
//        // 分页对象 全部字段
//        PagingDozer<ResourceItem, ResourceItemVO> resourceItemPaging = new PagingDozer<>(resourceItemList, ResourceItemVO.class);
//        // 第二次构造分页数据格式
////        List<ResourceItemVO> resourceItemVOS = new ArrayList<>();
////
////        Mapper mapper = DozerBeanMapperBuilder.buildDefault();
////
////        resourceItemList.forEach(r -> {
//////            ResourceItemVO resourceItemVO = new ResourceItemVO();
//////            BeanUtils.copyProperties(r, resourceItemVO);
////            ResourceItemVO resourceItemVO = mapper.map(r, ResourceItemVO.class);
////            resourceItemVOS.add(resourceItemVO);
////
////        });
//        return new UnifyResponse(200, "success", rep.getRequestURI(), resourceItemPaging);
//
//    }

//    @GetMapping("/res/{name}")
//    public UnifyResponse res(@PathVariable String name, HttpServletRequest rep) {
//        Resource resource = resourceService.getResource(name);
//        if (resource == null) {
//            throw new NotFoundException(3000);
//        }
//        System.out.println(resource);
//        ResourceVO resourceVO = new ResourceVO();
//        BeanUtils.copyProperties(resource, resourceVO);
////        return resource;
//        return new UnifyResponse(200, "success", rep.getRequestURI(), resourceVO);
//
//    }

    // @RequestMapping 包含了http请求的所有动词
    @GetMapping("/test")
    public String test() throws Exception {
        // 接口的方法调用
        // heroB.q();
        // heroc.q();
        ic.q();
//        throw new Exception("异常");

//        throw new NotFoundException(1000);
        return "Hello, Gage!";
    }

    // 参数接收
    @PostMapping("/test/{id}")
    // PathVariable 路径参数   RequestParam查询参数   RequestBody 请求体参数
    public PersonDTO test1(@PathVariable Integer id, @RequestParam String name, @RequestBody @Validated PersonDTO personDTO) {
        // 注意两种方式
        //        return new PersonDTO("test", 18);

        return PersonDTO.builder().name("测试").id(20).build();


    }

    // 老写法
    //    // 类似python装饰器 把方法注入
    //    @GetMapping("/test")
    //    //把异常 派出去
    //    public void test(HttpServletResponse response) throws Exception {
    //        response.getWriter().write("hello world!");
    //
    //    }
}
