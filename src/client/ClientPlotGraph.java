package client;
import java.util.List;
import java.util.Map;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.time.Millisecond;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.xy.XYDataset;

public class ClientPlotGraph extends JFrame {
	/**
	 * GraphPlot plots data as line graphs based on the number of channels.
	 * The graph is plotted depending on the frequency set.
	 */
	private static final long serialVersionUID = 1L;
	TimeSeries[] graph;
	ClientData data = new ClientData();
	int channelCount=0;
	private static JFreeChart chart;
	private static ChartPanel chartPanel;
	public ChartPanel drawGraph(int channels) {

		graph=new TimeSeries[channels];
		final TimeSeriesCollection dataset=new TimeSeriesCollection();
		channelCount=channels;
		for(int channel=0;channel<channels;channel++) {

			graph[channel] = new TimeSeries("Channel "+channel);
			dataset.addSeries(graph[channel]);
		}

		chart = createChart(dataset);

		chartPanel = new ChartPanel(chart);
		return chartPanel;
	}
	private JFreeChart createChart(final XYDataset dataset) {
		final JFreeChart result = ChartFactory.createTimeSeriesChart(
				"Graph Plot", "", "", dataset, true, true, true);

		final XYPlot plot = result.getXYPlot();
		plot.setDomainGridlinesVisible(false);
		plot.setRangeGridlinesVisible(false);
		ValueAxis xaxis = plot.getDomainAxis();
		xaxis.setAutoRange(true);
		//xaxis.setFixedAutoRange(channelCount*500); 
		xaxis.setVerticalTickLabels(false);
		xaxis.setTickLabelsVisible(false);
		ValueAxis yaxis = plot.getDomainAxis();
		yaxis.setVerticalTickLabels(false);
		yaxis.setTickLabelsVisible(false);
		return result;
	}

	public void plotGraph(int channels, int frequency, Map<Integer, List<Integer>> dataMap) {
		if(!dataMap.isEmpty())
		{
			for(int channel=0;channel<channels;channel++) {
				int x=dataMap.get(channel).size();
				int y = dataMap.get(channel).get(x-1);
				System.out.println("Plotting number.. "+y);
				graph[channel].add(new Millisecond(),y);
			}
		}
	}


}