
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import AimodelAiModelManager from "./components/listers/AimodelAiModelCards"
import AimodelAiModelDetail from "./components/listers/AimodelAiModelDetail"

import VisualizeVisualizeManager from "./components/listers/VisualizeVisualizeCards"
import VisualizeVisualizeDetail from "./components/listers/VisualizeVisualizeDetail"

import DataTrainDataManager from "./components/listers/DataTrainDataCards"
import DataTrainDataDetail from "./components/listers/DataTrainDataDetail"
import DataRiskDataManager from "./components/listers/DataRiskDataCards"
import DataRiskDataDetail from "./components/listers/DataRiskDataDetail"

import StatisticStatisticManager from "./components/listers/StatisticStatisticCards"
import StatisticStatisticDetail from "./components/listers/StatisticStatisticDetail"

import SummarySummaryManager from "./components/listers/SummarySummaryCards"
import SummarySummaryDetail from "./components/listers/SummarySummaryDetail"



export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/aimodels/aiModels',
                name: 'AimodelAiModelManager',
                component: AimodelAiModelManager
            },
            {
                path: '/aimodels/aiModels/:id',
                name: 'AimodelAiModelDetail',
                component: AimodelAiModelDetail
            },

            {
                path: '/visualizes/visualizes',
                name: 'VisualizeVisualizeManager',
                component: VisualizeVisualizeManager
            },
            {
                path: '/visualizes/visualizes/:id',
                name: 'VisualizeVisualizeDetail',
                component: VisualizeVisualizeDetail
            },

            {
                path: '/data/trainData',
                name: 'DataTrainDataManager',
                component: DataTrainDataManager
            },
            {
                path: '/data/trainData/:id',
                name: 'DataTrainDataDetail',
                component: DataTrainDataDetail
            },
            {
                path: '/data/riskData',
                name: 'DataRiskDataManager',
                component: DataRiskDataManager
            },
            {
                path: '/data/riskData/:id',
                name: 'DataRiskDataDetail',
                component: DataRiskDataDetail
            },

            {
                path: '/statistics/statistics',
                name: 'StatisticStatisticManager',
                component: StatisticStatisticManager
            },
            {
                path: '/statistics/statistics/:id',
                name: 'StatisticStatisticDetail',
                component: StatisticStatisticDetail
            },

            {
                path: '/summaries/summaries',
                name: 'SummarySummaryManager',
                component: SummarySummaryManager
            },
            {
                path: '/summaries/summaries/:id',
                name: 'SummarySummaryDetail',
                component: SummarySummaryDetail
            },




    ]
})
