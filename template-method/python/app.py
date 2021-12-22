# Created by Sezer BOZKIR<admin@sezerbozkir.com> at 22.12.2021
from xml_analyzer_base import XmlDataAnalyzer
from html_analyzer_base import HtmlDataAnalyzer

if __name__ == '__main__':
    data_analyzer = XmlDataAnalyzer()
    data_analyzer.analyze_data_of_last_week()
    """
    output:
    Method worked: GetDataOfLastWeek
    Method worked: AnalyzeData
    XML exported.
    """

    data_analyzer = HtmlDataAnalyzer()
    data_analyzer.analyze_data_of_last_week()
    """
    output:
    Method worked: GetDataOfLastWeek
    Method worked: AnalyzeData
    HTML exported.
    """
