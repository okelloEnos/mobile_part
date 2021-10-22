package com.okellosoftwarez.complynx_test
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.okellosoftwarez.complynx_test.databinding.ActivityLastTransactionBinding
import com.okellosoftwarez.complynx_test.model.Transaction
import ir.androidexception.datatable.model.DataTableHeader
import ir.androidexception.datatable.model.DataTableRow

class LastTransaction : AppCompatActivity() {
    private lateinit var binding: ActivityLastTransactionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLastTransactionBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        var total: Int = 0
        var transactionItems = ArrayList<Transaction>()
        transactionItems.add(Transaction("TRN1001", "5000"))
        transactionItems.add(Transaction("TRN1002", "1700"))
        transactionItems.add(Transaction("TRN1003", "1300"))

        val dataTable = binding.dataTable

        val header = DataTableHeader.Builder()
            .item("Transaction ID", 4)
            .item("Amount", 4)
            .build();

        val rows =  ArrayList<DataTableRow>();

        for(tran in transactionItems) {

            val row = DataTableRow.Builder()
                .value("${tran.transactionId}")
                .value("${tran.amount}")
                .build()

            total += tran.amount.toInt()
            rows.add(row)
        }

        val row = DataTableRow.Builder()
            .value("Total")
            .value("$total")
            .build()

        rows.add(row)

        dataTable.header = header;
        dataTable.rows = rows;
        dataTable.inflate(this);

    }

    }
