package model;

import java.math.BigDecimal;
import java.util.List;

public class Article {
    private Long id;
    private String reference;
    private Long description;
    private BigDecimal retailPrice;
    private Integer stock;
    private List<String> tags;
    private BigDecimal wholePrice;

    public Article(Long id) {
        this.id = id;
    }

    public static Builder builder(Long id){
        return new Builder(id);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Long getDescription() {
        return description;
    }

    public void setDescription(Long description) {
        this.description = description;
    }

    public BigDecimal getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(BigDecimal retailPrice) {
        this.retailPrice = retailPrice;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public BigDecimal getWholePrice() {
        return wholePrice;
    }

    public void setWholePrice(BigDecimal wholePrice) {
        this.wholePrice = wholePrice;
    }

    public static class Builder {
        private Article article;

        private Builder(Long id) {
            this.article = new Article(id);
        }

        public Builder reference(String reference){
            this.article.reference=reference;
            return this;
        }

        public Builder description(Long description){
            this.article.description=description;
            return this;
        }
        public Builder retailPrice(BigDecimal retailPrice){
            this.article.retailPrice=retailPrice;
            return this;
        }

        public Builder stock(int stock){
            this.article.stock=stock;
            return this;
        }

        public Builder tags(List<String> tags){
            this.article.tags=tags;
            return this;
        }

        public Builder wholePrice(BigDecimal wholePrice){
            this.article.wholePrice=wholePrice;
            return this;
        }
    }
}
