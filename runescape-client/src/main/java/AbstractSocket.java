import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("li")
@Implements("AbstractSocket")
public abstract class AbstractSocket {
	protected AbstractSocket() {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1705512918"
	)
	@Export("close")
	public abstract void close();

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "-75"
	)
	@Export("readUnsignedByte")
	public abstract int readUnsignedByte() throws IOException;

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "-65"
	)
	@Export("available")
	public abstract int available() throws IOException;

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(II)Z",
		garbageValue = "1604537239"
	)
	@Export("isAvailable")
	public abstract boolean isAvailable(int var1) throws IOException;

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "([BIIB)I",
		garbageValue = "121"
	)
	@Export("read")
	public abstract int read(byte[] var1, int var2, int var3) throws IOException;

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "([BIII)V",
		garbageValue = "199608149"
	)
	@Export("write")
	public abstract void write(byte[] var1, int var2, int var3) throws IOException;

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "-1917773732"
	)
	@Export("runWidgetOnLoadListener")
	static void runWidgetOnLoadListener(int var0) {
		if (var0 != -1) {
			if (class15.loadInterface(var0)) {
				Widget[] var1 = Widget.Widget_interfaceComponents[var0];

				for (int var2 = 0; var2 < var1.length; ++var2) {
					Widget var3 = var1[var2];
					if (var3.onLoad != null) {
						ScriptEvent var4 = new ScriptEvent();
						var4.widget = var3;
						var4.args = var3.onLoad;
						FaceNormal.runScript(var4, 5000000, 0);
					}
				}

			}
		}
	}
}
