package sok.sokong.multiply

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment

class MultiplyFragment : Fragment(R.layout.fragment_multiply) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Access the arguments using Safe Args
        val args = MultiplyFragmentArgs.fromBundle(requireArguments())
        val number1 = args.number1
        val number2 = args.number2
        val result = number1 * number2

        val output: TextView = view.findViewById(R.id.mf_multiply)
        output.text = "$number1 * $number2 = $result"
    }
}
