package cn.zwz.asset.entity;

import cn.zwz.basics.baseClass.ZwzBaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * @author 郑为中
 */
@Data
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "a_assets_type")
@TableName("a_assets_type")
@ApiModel(value = "资产种类")
public class AssetsType extends ZwzBaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "资产名称")
    private String assetName;

    @ApiModelProperty(value = "分类")
    private String nature;

    @ApiModelProperty(value = "型号")
    private String model;

    @ApiModelProperty(value = "总数量")
    private BigDecimal number;

    @ApiModelProperty(value = "现有数量")
    private BigDecimal existingNumber;

    @ApiModelProperty(value = "单价")
    private BigDecimal unitPrice;

    @ApiModelProperty(value = "总价")
    private BigDecimal totalPrice;

    @ApiModelProperty(value = "备注")
    private String remarks;
}