var line = echarts.init(document.getElementById("line"));

var lineOption = {
    title: {
        text: 'Fund Manager',
        x: 'left',
    },
    tooltip: {
        trigger: 'axis'
    },
    legend: {
        data:['Security1', 'Security2']
    },
    xAxis: {
        type: 'category',
        boundaryGap: false,
        data: ['date1', 'date2', 'date3', 'date4', 'date5', 'date6', 'date7']
    },
    yAxis: {
        type: 'value',
        axisLabel: {
            formatter: '{value}'
        }
    },
    series: [
        {
            name:'Security1',
            type:'line',
            data:[11, 11, 15, 13, 12, 13, 10],
            markPoint: {
                data: [
                    {type: 'max', name: '最大值'},
                    {type: 'min', name: '最小值'}
                ]
            },
            markLine: {
                data: [
                    {type: 'average', name: '平均值'}
                ]
            }
        },
        {
            name:'Security2',
            type:'line',
            data:[1, -2, 2, 5, 3, 2, 0],
            markPoint: {
                data: [
                    {type: 'max', name: '最大值'},
                    {type: 'min', name: '最小值'}
                ]
            },
            markLine: {
                data: [
                    {type: 'average', name: '平均值'}
                ]
            }
        }
    ]
};

line.setOption(lineOption);