import java.nio.ByteBuffer;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iu")
@Implements("DirectByteArrayCopier")
public class DirectByteArrayCopier extends AbstractByteArrayCopier {
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lb;"
	)
	static ClanSettings field3128;
	@ObfuscatedName("f")
	@Export("directBuffer")
	ByteBuffer directBuffer;

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "895258324"
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
		descriptor = "([BI)V",
		garbageValue = "894306984"
	)
	@Export("set")
	public void set(byte[] var1) {
		this.directBuffer = ByteBuffer.allocateDirect(var1.length);
		this.directBuffer.position(0);
		this.directBuffer.put(var1);
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-1"
	)
	static final void method4955(String var0) {
		StringBuilder var10000 = new StringBuilder();
		Object var10001 = null;
		var10000 = var10000.append("Please remove ").append(var0);
		var10001 = null;
		String var1 = var10000.append(" from your ignore list first").toString();
		UserComparator10.addGameMessage(30, "", var1);
	}
}
