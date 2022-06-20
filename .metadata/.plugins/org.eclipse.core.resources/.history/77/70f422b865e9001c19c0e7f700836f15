package com.kosmetolog.admin.settings;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.kosmetolog.entity.setting.Setting;
import com.kosmetolog.entity.setting.SettingCategory;


public interface SettingRepository extends CrudRepository<Setting, String> {
	public List<Setting> findByCategory(SettingCategory category);
}
