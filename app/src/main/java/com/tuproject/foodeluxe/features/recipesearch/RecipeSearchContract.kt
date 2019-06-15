package com.tuproject.foodeluxe.features.recipesearch

import com.tuproject.BasePresenter
import com.tuproject.BaseView
import com.tuproject.foodeluxe.data.RecipeItem
import com.tuproject.foodeluxe.data.RecipeSearchResults
import io.reactivex.Observable


interface RecipeSearchContract {

    interface View : BaseView<Presenter> {

    }

    interface Presenter : BasePresenter<View> {

        override fun takeView(view: RecipeSearchContract.View)
        override fun dropView()
        fun getRecipes(q: String): Observable<RecipeSearchResults>
        fun saveItemToRecipeDatabase(item: RecipeItem)
    }
}