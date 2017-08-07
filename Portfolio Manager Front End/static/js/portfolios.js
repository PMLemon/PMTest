var bar = echarts.init(document.getElementById("bar"));

var barOption = {
    title: {
        text: 'Portfolios',
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

bar.setOption(barOption);