import java.nio.ByteBuffer;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hf")
@Implements("DirectByteArrayCopier")
public class DirectByteArrayCopier extends AbstractByteArrayCopier {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "Lig;"
	)
	@Export("Widget_modelsArchive")
	static AbstractArchive Widget_modelsArchive;
	@ObfuscatedName("n")
	@Export("directBuffer")
	ByteBuffer directBuffer;

	DirectByteArrayCopier() {
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		garbageValue = "1361682252",
		signature = "(I)[B"
	)
	@Export("get")
	byte[] get() {
		byte[] var1 = new byte[this.directBuffer.capacity()];
		this.directBuffer.position(0);
		this.directBuffer.get(var1);
		return var1;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		garbageValue = "262833794",
		signature = "([BI)V"
	)
	@Export("set")
	void set(byte[] var1) {
		this.directBuffer = ByteBuffer.allocateDirect(var1.length);
		this.directBuffer.position(0);
		this.directBuffer.put(var1);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		garbageValue = "292233920",
		signature = "(Lig;I)V"
	)
	public static void method4147(AbstractArchive var0) {
		StructDefinition.StructDefinition_archive = var0;
	}
}
