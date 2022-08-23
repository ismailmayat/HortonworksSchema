/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package schema;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Product extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 1605234145809668334L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Product\",\"namespace\":\"schema\",\"fields\":[{\"name\":\"productId\",\"type\":\"int\",\"doc\":\"Identifier for reference\"},{\"name\":\"name\",\"type\":\"string\",\"doc\":\"Name of the product\"},{\"name\":\"description\",\"type\":\"string\",\"doc\":\"Price per unit\"}],\"doc:\":\"Product that can be ordered\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Product> ENCODER =
      new BinaryMessageEncoder<Product>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Product> DECODER =
      new BinaryMessageDecoder<Product>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Product> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Product> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Product>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Product to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Product from a ByteBuffer. */
  public static Product fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** Identifier for reference */
  @Deprecated public int productId;
  /** Name of the product */
  @Deprecated public java.lang.CharSequence name;
  /** Price per unit */
  @Deprecated public java.lang.CharSequence description;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Product() {}

  /**
   * All-args constructor.
   * @param productId Identifier for reference
   * @param name Name of the product
   * @param description Price per unit
   */
  public Product(java.lang.Integer productId, java.lang.CharSequence name, java.lang.CharSequence description) {
    this.productId = productId;
    this.name = name;
    this.description = description;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return productId;
    case 1: return name;
    case 2: return description;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: productId = (java.lang.Integer)value$; break;
    case 1: name = (java.lang.CharSequence)value$; break;
    case 2: description = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'productId' field.
   * @return Identifier for reference
   */
  public java.lang.Integer getProductId() {
    return productId;
  }

  /**
   * Sets the value of the 'productId' field.
   * Identifier for reference
   * @param value the value to set.
   */
  public void setProductId(java.lang.Integer value) {
    this.productId = value;
  }

  /**
   * Gets the value of the 'name' field.
   * @return Name of the product
   */
  public java.lang.CharSequence getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * Name of the product
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'description' field.
   * @return Price per unit
   */
  public java.lang.CharSequence getDescription() {
    return description;
  }

  /**
   * Sets the value of the 'description' field.
   * Price per unit
   * @param value the value to set.
   */
  public void setDescription(java.lang.CharSequence value) {
    this.description = value;
  }

  /**
   * Creates a new Product RecordBuilder.
   * @return A new Product RecordBuilder
   */
  public static schema.Product.Builder newBuilder() {
    return new schema.Product.Builder();
  }

  /**
   * Creates a new Product RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Product RecordBuilder
   */
  public static schema.Product.Builder newBuilder(schema.Product.Builder other) {
    return new schema.Product.Builder(other);
  }

  /**
   * Creates a new Product RecordBuilder by copying an existing Product instance.
   * @param other The existing instance to copy.
   * @return A new Product RecordBuilder
   */
  public static schema.Product.Builder newBuilder(schema.Product other) {
    return new schema.Product.Builder(other);
  }

  /**
   * RecordBuilder for Product instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Product>
    implements org.apache.avro.data.RecordBuilder<Product> {

    /** Identifier for reference */
    private int productId;
    /** Name of the product */
    private java.lang.CharSequence name;
    /** Price per unit */
    private java.lang.CharSequence description;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(schema.Product.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.productId)) {
        this.productId = data().deepCopy(fields()[0].schema(), other.productId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.description)) {
        this.description = data().deepCopy(fields()[2].schema(), other.description);
        fieldSetFlags()[2] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Product instance
     * @param other The existing instance to copy.
     */
    private Builder(schema.Product other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.productId)) {
        this.productId = data().deepCopy(fields()[0].schema(), other.productId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.description)) {
        this.description = data().deepCopy(fields()[2].schema(), other.description);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'productId' field.
      * Identifier for reference
      * @return The value.
      */
    public java.lang.Integer getProductId() {
      return productId;
    }

    /**
      * Sets the value of the 'productId' field.
      * Identifier for reference
      * @param value The value of 'productId'.
      * @return This builder.
      */
    public schema.Product.Builder setProductId(int value) {
      validate(fields()[0], value);
      this.productId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'productId' field has been set.
      * Identifier for reference
      * @return True if the 'productId' field has been set, false otherwise.
      */
    public boolean hasProductId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'productId' field.
      * Identifier for reference
      * @return This builder.
      */
    public schema.Product.Builder clearProductId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'name' field.
      * Name of the product
      * @return The value.
      */
    public java.lang.CharSequence getName() {
      return name;
    }

    /**
      * Sets the value of the 'name' field.
      * Name of the product
      * @param value The value of 'name'.
      * @return This builder.
      */
    public schema.Product.Builder setName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.name = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * Name of the product
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'name' field.
      * Name of the product
      * @return This builder.
      */
    public schema.Product.Builder clearName() {
      name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'description' field.
      * Price per unit
      * @return The value.
      */
    public java.lang.CharSequence getDescription() {
      return description;
    }

    /**
      * Sets the value of the 'description' field.
      * Price per unit
      * @param value The value of 'description'.
      * @return This builder.
      */
    public schema.Product.Builder setDescription(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.description = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'description' field has been set.
      * Price per unit
      * @return True if the 'description' field has been set, false otherwise.
      */
    public boolean hasDescription() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'description' field.
      * Price per unit
      * @return This builder.
      */
    public schema.Product.Builder clearDescription() {
      description = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Product build() {
      try {
        Product record = new Product();
        record.productId = fieldSetFlags()[0] ? this.productId : (java.lang.Integer) defaultValue(fields()[0]);
        record.name = fieldSetFlags()[1] ? this.name : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.description = fieldSetFlags()[2] ? this.description : (java.lang.CharSequence) defaultValue(fields()[2]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Product>
    WRITER$ = (org.apache.avro.io.DatumWriter<Product>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Product>
    READER$ = (org.apache.avro.io.DatumReader<Product>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
