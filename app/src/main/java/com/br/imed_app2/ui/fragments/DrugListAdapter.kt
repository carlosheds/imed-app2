package com.br.imed_app2.ui.fragments

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.br.imed_app2.databinding.ItemDrugBinding
import com.br.imed_app2.model.Drug

class DrugListAdapter() : ListAdapter<Drug, DrugViewHolder>(DiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DrugViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val itemDrug = ItemDrugBinding.inflate(inflater, parent, false)
        return DrugViewHolder(itemDrug)
    }

    override fun onBindViewHolder(holder: DrugViewHolder, position: Int) {
        holder.setupView(getItem(position))
    }

}

class DrugViewHolder(private val binding: ItemDrugBinding) : RecyclerView.ViewHolder(binding.root) {
    fun setupView(drug: Drug) {
        binding.tvMedicationName.text = drug.name
        binding.tvDosage.text = drug.dosage
        binding.tvFrequency.text = drug.frequency
        binding.tvStartTime.text = drug.startTime
    }
}

class DiffCallback : DiffUtil.ItemCallback<Drug>() {
    override fun areItemsTheSame(oldItem: Drug, newItem: Drug): Boolean = oldItem == newItem
    override fun areContentsTheSame(oldItem: Drug, newItem: Drug): Boolean =
        oldItem.id == newItem.id
}