import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qh")
@Implements("AbstractSocket")
public abstract class AbstractSocket {
	AbstractSocket() {
	} // L: 7

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1802443781"
	)
	@Export("isAvailable")
	public abstract boolean isAvailable(int var1) throws IOException;

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1927697779"
	)
	@Export("available")
	public abstract int available() throws IOException;

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "59"
	)
	@Export("readUnsignedByte")
	public abstract int readUnsignedByte() throws IOException;

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "([BIII)I",
		garbageValue = "435794101"
	)
	@Export("read")
	public abstract int read(byte[] var1, int var2, int var3) throws IOException;

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "1992519516"
	)
	@Export("write")
	public abstract void write(byte[] var1, int var2, int var3) throws IOException;

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1268085940"
	)
	@Export("close")
	public abstract void close();

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)Ltk;",
		garbageValue = "16"
	)
	public static class506 method8105(int var0) {
		class506 var1 = (class506)class506.DBTableType_cache.get((long)var0); // L: 23
		if (var1 != null) { // L: 24
			return var1;
		} else {
			byte[] var2 = class506.field5043.takeFile(39, var0); // L: 25
			var1 = new class506(); // L: 26
			if (var2 != null) { // L: 27
				var1.method8969(new Buffer(var2));
			}

			var1.method8968(); // L: 28
			class506.DBTableType_cache.put(var1, (long)var0); // L: 29
			return var1; // L: 30
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IS)I",
		garbageValue = "19989"
	)
	public static int method8104(int var0) {
		return class465.field4788[var0 & 16383]; // L: 32
	}
}
