import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("k")
public class class9 implements class349 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lk;"
	)
	public static final class9 field31;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lk;"
	)
	public static final class9 field32;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lk;"
	)
	static final class9 field33;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lk;"
	)
	static final class9 field42;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lk;"
	)
	static final class9 field35;
	@ObfuscatedName("u")
	@Export("ByteArrayPool_arrays")
	public static byte[][][] ByteArrayPool_arrays;
	@ObfuscatedName("on")
	@ObfuscatedGetter(
		intValue = -1648378979
	)
	@Export("selectedSpellWidget")
	static int selectedSpellWidget;
	@ObfuscatedName("qa")
	@ObfuscatedSignature(
		descriptor = "Ldw;"
	)
	@Export("varcs")
	static Varcs varcs;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 294665859
	)
	int field36;
	@ObfuscatedName("i")
	String field37;
	@ObfuscatedName("n")
	boolean field38;
	@ObfuscatedName("l")
	boolean field39;

	static {
		field31 = new class9(0, "POST", true, true); // L: 6
		field32 = new class9(1, "GET", true, false); // L: 7
		field33 = new class9(2, "PUT", false, true); // L: 8
		field42 = new class9(3, "PATCH", false, true); // L: 9
		field35 = new class9(4, "DELETE", false, true); // L: 10
	}

	class9(int var1, String var2, boolean var3, boolean var4) {
		this.field36 = var1; // L: 17
		this.field37 = var2; // L: 18
		this.field38 = var3; // L: 19
		this.field39 = var4; // L: 20
	} // L: 21

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "3"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field36; // L: 37
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "119"
	)
	boolean method92() {
		return this.field38; // L: 24
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-39"
	)
	public String method80() {
		return this.field37;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-16"
	)
	boolean method84() {
		return this.field39; // L: 32
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lln;B)V",
		garbageValue = "0"
	)
	public static void method81(AbstractArchive var0) {
		DevicePcmPlayerProvider.VarbitDefinition_archive = var0; // L: 28
	} // L: 29

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-38"
	)
	public static void method93() {
		synchronized(MouseHandler.MouseHandler_instance) { // L: 44
			MouseHandler.MouseHandler_currentButton = MouseHandler.MouseHandler_currentButtonVolatile; // L: 45
			MouseHandler.MouseHandler_x = MouseHandler.MouseHandler_xVolatile; // L: 46
			MouseHandler.MouseHandler_y = MouseHandler.MouseHandler_yVolatile; // L: 47
			MouseHandler.MouseHandler_millis = MouseHandler.MouseHandler_lastMovedVolatile; // L: 48
			MouseHandler.MouseHandler_lastButton = MouseHandler.MouseHandler_lastButtonVolatile; // L: 49
			MouseHandler.MouseHandler_lastPressedX = MouseHandler.MouseHandler_lastPressedXVolatile; // L: 50
			MouseHandler.MouseHandler_lastPressedY = MouseHandler.MouseHandler_lastPressedYVolatile; // L: 51
			MouseHandler.MouseHandler_lastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillisVolatile; // L: 52
			MouseHandler.MouseHandler_lastButtonVolatile = 0; // L: 53
		}
	} // L: 55
}
