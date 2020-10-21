import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gd")
@Implements("LoginPacket")
public class LoginPacket implements class190 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lgd;"
	)
	public static final LoginPacket field2340;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "Lgd;"
	)
	static final LoginPacket field2338;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "Lgd;"
	)
	public static final LoginPacket field2339;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lgd;"
	)
	public static final LoginPacket field2341;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Lgd;"
	)
	public static final LoginPacket field2342;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "Lgd;"
	)
	static final LoginPacket field2346;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "[Lgd;"
	)
	@Export("LoginPacket_indexedValues")
	static final LoginPacket[] LoginPacket_indexedValues;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1924738563
	)
	@Export("id")
	public final int id;

	static {
		field2340 = new LoginPacket(14, 0);
		field2338 = new LoginPacket(15, 4);
		field2339 = new LoginPacket(16, -2);
		field2341 = new LoginPacket(18, -2);
		field2342 = new LoginPacket(19, -2);
		field2346 = new LoginPacket(27, 0);
		LoginPacket_indexedValues = new LoginPacket[32];
		LoginPacket[] var0 = WorldMapDecorationType.method4257();

		for (int var1 = 0; var1 < var0.length; ++var1) {
			LoginPacket_indexedValues[var0[var1].id] = var0[var1];
		}

	}

	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "0"
	)
	LoginPacket(int var1, int var2) {
		this.id = var1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(IS)Z",
		garbageValue = "24475"
	)
	public static boolean method3751(int var0) {
		return var0 >= WorldMapDecorationType.field2750.id && var0 <= WorldMapDecorationType.field2754.id || var0 == WorldMapDecorationType.field2751.id;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(II)Lex;",
		garbageValue = "1232258990"
	)
	@Export("getFrames")
	static Frames getFrames(int var0) {
		Frames var1 = (Frames)SequenceDefinition.SequenceDefinition_cachedFrames.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			var1 = class60.method984(SequenceDefinition.SequenceDefinition_animationsArchive, DefaultsGroup.SequenceDefinition_skeletonsArchive, var0, false);
			if (var1 != null) {
				SequenceDefinition.SequenceDefinition_cachedFrames.put(var1, (long)var0);
			}

			return var1;
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
		garbageValue = "1962792028"
	)
	public static String method3747(CharSequence var0) {
		return class198.method3786('*', var0.length());
	}
}
