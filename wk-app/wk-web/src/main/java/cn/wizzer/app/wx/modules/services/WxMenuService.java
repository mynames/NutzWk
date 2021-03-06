package cn.wizzer.app.wx.modules.services;

import cn.wizzer.framework.base.service.BaseService;
import cn.wizzer.app.wx.modules.models.Wx_menu;

public interface WxMenuService extends BaseService<Wx_menu> {
    void save(Wx_menu menu, String pid);

    void deleteAndChild(Wx_menu menu);
}
