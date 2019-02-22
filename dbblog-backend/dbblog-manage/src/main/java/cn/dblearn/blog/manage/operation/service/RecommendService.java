package cn.dblearn.blog.manage.operation.service;

import cn.dblearn.blog.common.util.PageUtils;
import cn.dblearn.blog.entity.operation.Recommend;
import cn.dblearn.blog.entity.operation.vo.RecommendVo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 推荐 服务类
 * </p>
 *
 * @author bobbi
 * @since 2019-02-22
 */
public interface RecommendService extends IService<Recommend> {

    /**
     * 分页查询
     * @param params
     * @return
     */
     PageUtils queryPage(Map<String, Object> params);

    /**
     * 获取推荐列表
     * @return
     */
    List<RecommendVo> listSelect();
}
