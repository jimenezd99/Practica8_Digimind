package jimenez.diana.digimind.ui.dashboard

import android.app.TimePickerDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import jimenez.diana.digimind.R
import kotlinx.android.synthetic.main.fragment_dashboard.*
import java.text.SimpleDateFormat
import java.util.*

class DashboardFragment : Fragment() {

    private lateinit var dashboardViewModel: DashboardViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        dashboardViewModel =
                ViewModelProvider(this).get(DashboardViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_dashboard, container, false)

        val btn_time2: Button =root.findViewById(R.id.btn_time)
        btn_time2.setOnClickListener(){
            val cal= Calendar.getInstance()
            val timeSetListener= TimePickerDialog.OnTimeSetListener { timePicker, hour, minute ->
                cal.set(Calendar.HOUR_OF_DAY, hour)
                cal.set(Calendar.MINUTE, minute)

                btn_time.text= SimpleDateFormat("HH:mm").format(cal.time)
            }
            TimePickerDialog(root.context,timeSetListener, cal.get(Calendar.HOUR_OF_DAY), cal.get(
                Calendar.MINUTE), true).show()

        }

        return root
    }
}