package com.lucascabral.tablayoutapp.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.lucascabral.tablayoutapp.fragments.CallsFragment
import com.lucascabral.tablayoutapp.fragments.MessagesFragment
import com.lucascabral.tablayoutapp.fragments.StatusFragment

class PageAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> { MessagesFragment() }
            1 -> { StatusFragment() }
            2 -> { CallsFragment() }
            else -> { MessagesFragment() }
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when(position) {
            0 -> { return "Messages" }
            1 -> { return "Status" }
            2 -> { return "Calls" }
        }
        return super.getPageTitle(position)
    }

    override fun getCount(): Int {
        return 3
    }
}
