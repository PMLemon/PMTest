var pie = echarts.init(document.getElementById("pie"));
var bar = echarts.init(document.getElementById("bar"));
var line = echarts.init(document.getElementById("line"));

var pieOption = {
    title: {
        text: 'Fund Manager',
        x: 'center',
    },
    legend: {
        x: 'left',
        orient: 'vertical',
        data: ['portfolio1', 'portfolio2', 'portfolio3', 'portfolio4', 'portfolio5']
    },
    tooltip: {
        trigger: 'item',
        formatter: '{b} : {c} ({d}%)'
    },
    series: [
        {
            name: 'portfolio',
            type: 'pie',
            radius: '50%',
            data: [
                {value: 100, name: 'portfolio1'},
                {value: 200, name: 'portfolio2'},
                {value: 200, name: 'portfolio3'},
                {value: 100, name: 'portfolio4'},
                {value: 400, name: 'portfolio5'},
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
var barOption = {
    title: {
        text: 'Fund Manager',
        x: 'center',
    },
    tooltip: {
        trigger: 'item',
        formatter: '{b} : {c} ({d}%)'
    },
    xAxis: {
        data: ['portfolio1', 'portfolio2', 'portfolio3', 'portfolio4', 'portfolio5']
    },
    yAxis: {},
    series: [
        {
            name: 'portfolio',
            type: 'bar',
            data: [100, 200, 100, 400, 200]
        }
    ]
};
var lineOption = {
    title: {
        text: 'Fund Manager',
        x: 'left',
    },
    tooltip: {
        trigger: 'axis'
    },
    legend: {
        data:['portfolio1', 'portfolio2']
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
            name:'portfolio1',
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
            name:'portfolio2',
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
                    {type: 'average', name: '平均值'},
                    [{
                        symbol: 'none',
                        x: '90%',
                        yAxis: 'max'
                    }, {
                        symbol: 'circle',
                        label: {
                            normal: {
                                position: 'start',
                                formatter: '最大值'
                            }
                        },
                        type: 'max',
                        name: '最高点'
                    }]
                ]
            }
        }
    ]
};

pie.setOption(pieOption);
bar.setOption(barOption);
line.setOption(lineOption);