package OpenSourceProjects_Storybook.patches.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.failureConditions.BuildFailureOnMetric
import jetbrains.buildServer.configs.kotlin.v2017_2.failureConditions.failOnMetricChange
import jetbrains.buildServer.configs.kotlin.v2017_2.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, change the buildType with uuid = '42cfbb9a-f35b-4f96-afae-0b508927a737' (id = 'OpenSourceProjects_Storybook_Lint')
accordingly, and delete the patch script.
*/
changeBuildType("42cfbb9a-f35b-4f96-afae-0b508927a737") {
    failureConditions {
        add {
            failOnMetricChange {
                metric = BuildFailureOnMetric.MetricType.INSPECTION_ERROR_COUNT
                threshold = 0
                units = BuildFailureOnMetric.MetricUnit.DEFAULT_UNIT
                comparison = BuildFailureOnMetric.MetricComparison.MORE
                compareTo = value()
                param("anchorBuild", "lastSuccessful")
            }
        }
    }
}