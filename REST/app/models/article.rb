class Article < ActiveRecord::Base
  def self.search(search)
    if search
      where("title like ? or content like ?", '%'+search+'%', '%'+search+'%').find_each
    else
      find(:all)
    end
  end
end
