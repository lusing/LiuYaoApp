package com.github.lusing.liuyao

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.github.lusing.liuyao.databinding.FragmentFirstBinding
import com.github.lusing.qimen.TianGan

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonFirst.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }

        binding.buttonCalc.setOnClickListener {
            val yue_gan = binding.spinnerYuegan.selectedItem
            val yue_zhi = binding.spinnerYuezhi.selectedItem
            val ri_gan = binding.spinnerRigan.selectedItem
            val ri_zhi = binding.spinnerRizhi.selectedItem

            val yue_gan2 = TianGan.getTianGan(yue_gan.toString())
            binding.textviewFirst.text = "$yue_gan$yue_zhi 月$ri_gan$ri_zhi 日 $yue_gan2"
        };
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}