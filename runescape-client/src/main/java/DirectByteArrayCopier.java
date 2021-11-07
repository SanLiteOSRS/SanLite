import java.nio.ByteBuffer;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jz")
@Implements("DirectByteArrayCopier")
public class DirectByteArrayCopier extends AbstractByteArrayCopier {
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("ItemDefinition_archive")
	public static AbstractArchive ItemDefinition_archive;
	@ObfuscatedName("j")
	static int[][] field3212;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "[Low;"
	)
	@Export("worldSelectBackSprites")
	static SpritePixels[] worldSelectBackSprites;
	@ObfuscatedName("i")
	@Export("directBuffer")
	ByteBuffer directBuffer;

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "99"
	)
	@Export("get")
	byte[] get() {
		byte[] var1 = new byte[this.directBuffer.capacity()];
		this.directBuffer.position(0);
		this.directBuffer.get(var1);
		return var1;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "-48"
	)
	@Export("set")
	public void set(byte[] var1) {
		this.directBuffer = ByteBuffer.allocateDirect(var1.length);
		this.directBuffer.position(0);
		this.directBuffer.put(var1);
	}

	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1646184786"
	)
	static final void method5179(int var0) {
		if (class174.loadInterface(var0)) {
			class135.drawModelComponents(WorldMapSection1.Widget_interfaceComponents[var0], -1);
		}
	}
}
