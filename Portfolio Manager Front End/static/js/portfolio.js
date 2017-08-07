var pie = echarts.init(document.getElementById("pie"));
var line = echarts.init(document.getElementById("line"));

var pieOption = {
    title: {
        text: 'Security Rate',
        x: 'center',
    },
    legend: {
        x: 'left',
        orient: 'vertical',
        data: ['Bond', 'Future', 'Equity', 'ETF', 'FRA']
    },
    tooltip: {
        trigger: 'item',
        formatter: '{b} : {c} ({d}%)'
    },
    series: [
        {
            name: 'Securit',
            type: 'pie',
            radius: '50%',
            data: [
                {value: 100, name: 'Bond'},
                {value: 200, name: 'Future'},
                {value: 200, name: 'Equity'},
                {value: 100, name: 'ETF'},
                {value: 400, name: 'FRA'},
            ],
            itemStyle: {
                emphasis: {
                    shadowBlur: 200,
                    shadowColor: 'rgba(0, 0, 0, 0.5)'
                }
            } 
        }
    ]
};
var lineOption = {
    title: {
        text: 'Daily Portfolio Profit',
        x: 'center',
    },
    tooltip: {
        trigger: 'axis'
    },
    xAxis: {
        type: 'category',
        boundaryGap: false,
        data: ['08/01', '08/02', '08/03', '08/04', '08/05', '08/06', '08/07']
    },
    yAxis: {
        type: 'value',
        axisLabel: {
            formatter: '{value}'
        }
    },
    series: [
        {
            name:'portfolio name',
            type:'line',
            data:[1500, 2000, -900, 1002, 7500, 2350, -5400],
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

pie.setOption(pieOption);
line.setOption(lineOption);