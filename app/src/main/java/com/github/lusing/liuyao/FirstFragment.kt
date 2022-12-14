package com.github.lusing.liuyao

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.github.lusing.liuyao.databinding.FragmentFirstBinding
import com.github.lusing.qimen.DiZhi
import com.github.lusing.qimen.LiuQin
import com.github.lusing.qimen.TianGan


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
            val yue_gan = binding.spinnerYuegan.selectedItemId
            val yue_zhi = binding.spinnerYuezhi.selectedItemId
            val ri_gan = binding.spinnerRigan.selectedItemId
            val ri_zhi = binding.spinnerRizhi.selectedItemId

            val yao1 = yaoId(binding.yao1.selectedItemId)
            val yao2 = yaoId(binding.yao2.selectedItemId)
            val yao3 = yaoId(binding.yao3.selectedItemId)
            val yao4 = yaoId(binding.yao4.selectedItemId)
            val yao5 = yaoId(binding.yao5.selectedItemId)
            val yao6 = yaoId(binding.yao6.selectedItemId)

            val yao = arrayOf(yao1, yao2, yao3, yao4, yao5, yao6)

            val gua = Gua64(yao, rg = ri_gan.toInt())

            val ly =
                LiuYao(gua = gua, yueJian = DiZhi.ZI, riJian = DiZhi.XU, yongShen = LiuQin.GUANGUI)
            ly.paiPan()

            binding.textviewFirst.text = "$yue_gan$yue_zhi 月$ri_gan$ri_zhi 日 $yao1 $yao2 $yao3"
        };
    }

    fun yaoId(id: Long): Int {
        return when (id) {
            0L -> 8
            1L -> 7
            2L -> 9
            3L -> 6
            else -> 0
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}