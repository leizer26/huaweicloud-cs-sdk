/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package com.huaweicloud.cs.scala.v1.model

import com.huaweicloud.cs.scala.v1.client.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class ClusterOverviewEntity (
  /* 集群总数 */
  totalClusters: Option[Int],
  /* 运行的集群总数 */
  runningClusterCount: Option[Int],
  /* 已完成的集群总数 */
  exceptionClusterCount: Option[Int],
  /* 运行异常的集群总数 */
  otherClusterCount: Option[Int],
  /* 正在运行的集群总费用 */
  runningClusterCharge: Option[Int],
  /* 正在运行的集群单价合计 */
  runningClusterPrice: Option[Int],
  /* 正在运行的集群消耗SPU总数 */
  runningClusterTotalSpu: Option[Int],
  /* 正在运行的集群总时长 */
  runningClusterTotalTime: Option[Int],
  /* 结算币种 */
  billingUnit: Option[ClusterOverviewEntityEnums.BillingUnit],
  /* 时间单位 */
  timeUnit: Option[ClusterOverviewEntityEnums.TimeUnit]
) extends ApiModel

object ClusterOverviewEntityEnums {

  type BillingUnit = BillingUnit.Value
  type TimeUnit = TimeUnit.Value
  object BillingUnit extends Enumeration {
    val CNY = Value("CNY")
    val HKD = Value("HKD")
    val EUR = Value("EUR")
    val DEM = Value("DEM")
    val USD = Value("USD")
  }

  object TimeUnit extends Enumeration {
    val HOUR = Value("HOUR")
  }

}

