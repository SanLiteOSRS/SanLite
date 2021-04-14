import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bg")
@Implements("ScriptFrame")
public class ScriptFrame {
	@ObfuscatedName("e")
	@Export("Interpreter_intLocals")
	static int[] Interpreter_intLocals;
	@ObfuscatedName("h")
	@Export("ByteArrayPool_arrays")
	static byte[][][] ByteArrayPool_arrays;
	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		signature = "Lhu;"
	)
	static Widget field579;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lcc;"
	)
	@Export("script")
	Script script;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 264975789
	)
	@Export("pc")
	int pc;
	@ObfuscatedName("u")
	@Export("intLocals")
	int[] intLocals;
	@ObfuscatedName("p")
	@Export("stringLocals")
	String[] stringLocals;

	ScriptFrame() {
		this.pc = -1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "([BI)[B",
		garbageValue = "-13856825"
	)
	public static byte[] method1175(byte[] var0) {
		int var1 = var0.length;
		byte[] var2 = new byte[var1];
		System.arraycopy(var0, 0, var2, 0, var1);
		return var2;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(B)Lbu;",
		garbageValue = "86"
	)
	@Export("getNextWorldListWorld")
	static World getNextWorldListWorld() {
		return World.World_listCount < World.World_count ? class9.World_worlds[++World.World_listCount - 1] : null;
	}

	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		signature = "(Lcd;II)V",
		garbageValue = "-395421228"
	)
	static final void method1173(Actor var0, int var1) {
		class14.worldToScreen(var0.x, var0.y, var1);
	}
}
