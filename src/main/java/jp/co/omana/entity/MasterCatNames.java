package jp.co.omana.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link MasterCat}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2012/10/21 1:59:19")
public class MasterCatNames {

    /**
     * catidのプロパティ名を返します。
     * 
     * @return catidのプロパティ名
     */
    public static PropertyName<Integer> catid() {
        return new PropertyName<Integer>("catid");
    }

    /**
     * catNameのプロパティ名を返します。
     * 
     * @return catNameのプロパティ名
     */
    public static PropertyName<String> catName() {
        return new PropertyName<String>("catName");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _MasterCatNames extends PropertyName<MasterCat> {

        /**
         * インスタンスを構築します。
         */
        public _MasterCatNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _MasterCatNames(final String name) {
            super(name);
        }

        /**
         * インスタンスを構築します。
         * 
         * @param parent
         *            親
         * @param name
         *            名前
         */
        public _MasterCatNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * catidのプロパティ名を返します。
         *
         * @return catidのプロパティ名
         */
        public PropertyName<Integer> catid() {
            return new PropertyName<Integer>(this, "catid");
        }

        /**
         * catNameのプロパティ名を返します。
         *
         * @return catNameのプロパティ名
         */
        public PropertyName<String> catName() {
            return new PropertyName<String>(this, "catName");
        }
    }
}