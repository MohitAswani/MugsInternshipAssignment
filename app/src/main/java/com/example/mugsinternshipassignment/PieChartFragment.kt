package com.example.mugsinternshipassignment

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mugsinternshipassignment.databinding.FragmentPieChartBinding
import com.github.mikephil.charting.charts.PieChart
import com.github.mikephil.charting.data.PieData
import com.github.mikephil.charting.data.PieDataSet
import com.github.mikephil.charting.data.PieEntry
import com.github.mikephil.charting.utils.ColorTemplate

class PieChartFragment : Fragment() {

    private lateinit var pieChart: PieChart
    private lateinit var binding:FragmentPieChartBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentPieChartBinding.inflate(inflater);

        pieChart=binding.pieChart

        val pieEntries= arrayListOf<PieEntry>();


        pieEntries.add(PieEntry(1.toFloat(),10))
        pieEntries.add(PieEntry(2.toFloat(),20))
        pieEntries.add(PieEntry(3.toFloat(),30))
        pieEntries.add(PieEntry(4.toFloat(),40))

        val pieDataSet= PieDataSet(pieEntries,"Bar Chart")
        val colors= mutableListOf<Int>()
        ColorTemplate.JOYFUL_COLORS.forEach { it->
            colors.add(it)
        }
        pieDataSet.colors = colors
        pieDataSet.setDrawValues(true)
        pieDataSet.valueTextColor=Color.WHITE
        pieDataSet.valueTextSize=16F
        pieChart.data= PieData(pieDataSet)
        pieChart.animateY(1000)
        pieChart.description.text="Bar Chat"
        pieChart.description.textColor= Color.BLUE

        return binding.root
    }


}