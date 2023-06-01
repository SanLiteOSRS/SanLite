import java.math.BigInteger;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cp")
public class class72 {
	@ObfuscatedName("at")
	static final BigInteger field861;
	@ObfuscatedName("ax")
	static final BigInteger field862;

	static {
		field861 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049"); // L: 20
		field862 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683"); // L: 21
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "213640948"
	)
	static void method2047() {
		Tiles.Tiles_minPlane = 99; // L: 45
		Tiles.field998 = new short[4][104][104]; // L: 46
		Tiles.field993 = new short[4][104][104]; // L: 47
		Tiles.field994 = new byte[4][104][104]; // L: 48
		WorldMapRectangle.field3005 = new byte[4][104][104]; // L: 49
		Tiles.field999 = new int[4][105][105]; // L: 50
		Tiles.field995 = new byte[4][105][105]; // L: 51
		Tiles.field996 = new int[105][105]; // L: 52
		class85.Tiles_hue = new int[104]; // L: 53
		Tiles.Tiles_saturation = new int[104]; // L: 54
		class209.Tiles_lightness = new int[104]; // L: 55
		MusicPatch.Tiles_hueMultiplier = new int[104]; // L: 56
		Tiles.field1004 = new int[104]; // L: 57
	} // L: 58

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "2099804884"
	)
	static final void method2049(String var0) {
		class147.method3138(var0 + " is already on your friend list"); // L: 120
	} // L: 121

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(Lsx;I)Ljava/lang/Object;",
		garbageValue = "-1681034266"
	)
	static Object method2048(class490 var0) {
		if (var0 == null) { // L: 5269
			throw new IllegalStateException("popValueOfType() failure - null baseVarType"); // L: 5270
		} else {
			switch(var0.field4976) { // L: 5272
			case 0:
				return Interpreter.Interpreter_stringStack[--class156.Interpreter_stringStackSize]; // L: 5278
			case 2:
				return Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 5274
			default:
				throw new IllegalStateException("popValueOfType() failure - unsupported type"); // L: 5276
			}
		}
	}
}
