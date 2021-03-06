package com.example.android_theerawuth_assignment.feature.main.datasource.remote

import com.example.android_theerawuth_assignment.application.network.Results
import com.example.android_theerawuth_assignment.application.network.safeApiCall
import com.example.android_theerawuth_assignment.feature.main.datasource.MainDataSource
import com.example.android_theerawuth_assignment.feature.main.domain.NotificationInfo
import com.example.android_theerawuth_assignment.feature.main.domain.Notifications
import com.example.android_theerawuth_assignment.feature.main.domain.ProfileDataModel

class MainRemoteDataSource(private val api: MainApi) : MainDataSource {

	override suspend fun getProfile(): Results<ProfileDataModel> {
		return safeApiCall {
			api.getProfile()
		}
	}

	override suspend fun getNotifications(userId: String): Results<List<NotificationInfo>> {
		return safeApiCall {
			api.getNotifications(userId)
		}
	}
}