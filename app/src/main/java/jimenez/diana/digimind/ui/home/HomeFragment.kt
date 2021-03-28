package jimenez.diana.digimind.ui.home

import android.app.TimePickerDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.TimePicker
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import jimenez.diana.digimind.R
import jimenez.diana.digimind.Task
import kotlinx.android.synthetic.main.fragment_dashboard.*
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

class HomeFragment : Fragment() {
    var task= ArrayList<Task>()
    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
                ViewModelProvider(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        //val textView: TextView = root.findViewById(R.id.text_home)


        return root
    }

    fun fillTask(){
        task.add(Task("Practice 1", arrayListOf("Monday"), "17:30"))
        task.add(Task("Practice 2", arrayListOf("Monday", "Sunday"), "17:00"))
        task.add(Task("Practice 3", arrayListOf("Wednesday"), "14:00"))
        task.add(Task("Practice 4", arrayListOf("Saturday"), "11:00"))
        task.add(Task("Practice 5", arrayListOf("Friday"), "13:00"))
    }
}