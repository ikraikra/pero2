package jp.co.omana.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link MovieCat}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2012/10/21 1:59:19")
public class MovieCatNames {

    /**
     * movieInfoMidのプロパティ名を返します。
     * 
     * @return movieInfoMidのプロパティ名
     */
    public static PropertyName<Integer> movieInfoMid() {
        return new PropertyName<Integer>("movieInfoMid");
    }

    /**
     * masterCatCatidのプロパティ名を返します。
     * 
     * @return masterCatCatidのプロパティ名
     */
    public static PropertyName<Integer> masterCatCatid() {
        return new PropertyName<Integer>("masterCatCatid");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _MovieCatNames extends PropertyName<MovieCat> {

        /**
         * インスタンスを構築します。
         */
        public _MovieCatNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _MovieCatNames(final String name) {
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
        public _MovieCatNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * movieInfoMidのプロパティ名を返します。
         *
         * @return movieInfoMidのプロパティ名
         */
        public PropertyName<Integer> movieInfoMid() {
            return new PropertyName<Integer>(this, "movieInfoMid");
        }

        /**
         * masterCatCatidのプロパティ名を返します。
         *
         * @return masterCatCatidのプロパティ名
         */
        public PropertyName<Integer> masterCatCatid() {
            return new PropertyName<Integer>(this, "masterCatCatid");
        }
    }
}