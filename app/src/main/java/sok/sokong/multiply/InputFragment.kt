package sok.sokong.multiply

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController

class InputFragment : Fragment(R.layout.fragment_input) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val button: Button = view.findViewById(R.id.bt_multiply)
        val number1: EditText = view.findViewById(R.id.number1)
        val number2: EditText = view.findViewById(R.id.number2)

        button.setOnClickListener {
            val n1: Float = number1.text.toString().toFloatOrNull() ?: 0.0f
            val n2: Float = number2.text.toString().toFloatOrNull() ?: 0.0f

            val action = InputFragmentDirections.actionInputFragmentToMultiplyFragment(n1, n2)
            view.findNavController().navigate(action)
        }
    }
}
