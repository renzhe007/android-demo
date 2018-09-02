package com.example.greendao.dao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.example.greendao.dao.entity.Author;
import com.example.greendao.dao.entity.Post;
import com.example.greendao.dao.entity.ScoreBean;
import com.example.greendao.dao.entity.ShopBean;
import com.example.greendao.dao.entity.StudentMsgBean;

import com.example.greendao.dao.AuthorDao;
import com.example.greendao.dao.PostDao;
import com.example.greendao.dao.ScoreBeanDao;
import com.example.greendao.dao.ShopBeanDao;
import com.example.greendao.dao.StudentMsgBeanDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig authorDaoConfig;
    private final DaoConfig postDaoConfig;
    private final DaoConfig scoreBeanDaoConfig;
    private final DaoConfig shopBeanDaoConfig;
    private final DaoConfig studentMsgBeanDaoConfig;

    private final AuthorDao authorDao;
    private final PostDao postDao;
    private final ScoreBeanDao scoreBeanDao;
    private final ShopBeanDao shopBeanDao;
    private final StudentMsgBeanDao studentMsgBeanDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        authorDaoConfig = daoConfigMap.get(AuthorDao.class).clone();
        authorDaoConfig.initIdentityScope(type);

        postDaoConfig = daoConfigMap.get(PostDao.class).clone();
        postDaoConfig.initIdentityScope(type);

        scoreBeanDaoConfig = daoConfigMap.get(ScoreBeanDao.class).clone();
        scoreBeanDaoConfig.initIdentityScope(type);

        shopBeanDaoConfig = daoConfigMap.get(ShopBeanDao.class).clone();
        shopBeanDaoConfig.initIdentityScope(type);

        studentMsgBeanDaoConfig = daoConfigMap.get(StudentMsgBeanDao.class).clone();
        studentMsgBeanDaoConfig.initIdentityScope(type);

        authorDao = new AuthorDao(authorDaoConfig, this);
        postDao = new PostDao(postDaoConfig, this);
        scoreBeanDao = new ScoreBeanDao(scoreBeanDaoConfig, this);
        shopBeanDao = new ShopBeanDao(shopBeanDaoConfig, this);
        studentMsgBeanDao = new StudentMsgBeanDao(studentMsgBeanDaoConfig, this);

        registerDao(Author.class, authorDao);
        registerDao(Post.class, postDao);
        registerDao(ScoreBean.class, scoreBeanDao);
        registerDao(ShopBean.class, shopBeanDao);
        registerDao(StudentMsgBean.class, studentMsgBeanDao);
    }
    
    public void clear() {
        authorDaoConfig.clearIdentityScope();
        postDaoConfig.clearIdentityScope();
        scoreBeanDaoConfig.clearIdentityScope();
        shopBeanDaoConfig.clearIdentityScope();
        studentMsgBeanDaoConfig.clearIdentityScope();
    }

    public AuthorDao getAuthorDao() {
        return authorDao;
    }

    public PostDao getPostDao() {
        return postDao;
    }

    public ScoreBeanDao getScoreBeanDao() {
        return scoreBeanDao;
    }

    public ShopBeanDao getShopBeanDao() {
        return shopBeanDao;
    }

    public StudentMsgBeanDao getStudentMsgBeanDao() {
        return studentMsgBeanDao;
    }

}
