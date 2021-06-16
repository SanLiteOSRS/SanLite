import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jl")
@Implements("StudioGame")
public enum StudioGame implements Enumerated
{
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	@Export("runescape")
	runescape("runescape", "RuneScape", 0),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	@Export("stellardawn")
	stellardawn("stellardawn", "Stellar Dawn", 1),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	@Export("game3")
	game3("game3", "Game 3", 2),
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	@Export("game4")
	game4("game4", "Game 4", 3),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	@Export("game5")
	game5("game5", "Game 5", 4),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	@Export("oldscape")
	oldscape("oldscape", "RuneScape 2007", 5);

	@ObfuscatedName("m")
	@Export("name")
	public final String name;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 698335859
	)
	@Export("id")
	final int id;

	StudioGame(String var3, String var4, int var5) {
		this.name = var3;
		this.id = var5;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1154679040"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IS)Z",
		garbageValue = "14714"
	)
	static boolean method4982(String var0, int var1) {
		return HealthBarUpdate.method2284(var0, var1, "openjs");
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZB)I",
		garbageValue = "1"
	)
	static int method4983(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.SOUND_SYNTH) {
			ChatChannel.Interpreter_intStackSize -= 3;
			ClanSettings.queueSoundEffect(Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize], Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 2]);
			return 1;
		} else if (var0 == ScriptOpcodes.SOUND_SONG) {
			class6.playSong(Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]);
			return 1;
		} else if (var0 == ScriptOpcodes.SOUND_JINGLE) {
			ChatChannel.Interpreter_intStackSize -= 2;
			ReflectionCheck.method1230(Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize], Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]);
			return 1;
		} else {
			int var3;
			if (var0 == 3203) {
				var3 = Math.min(Math.max(Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize], 0), 100);
				class0.method0(Math.round(2.55F * (float)var3));
				return 1;
			} else if (var0 == 3204) {
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Math.round((float)class4.clientPreferences.musicVolume / 2.55F);
				return 1;
			} else if (var0 == 3205) {
				var3 = Math.min(Math.max(Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize], 0), 100);
				class226.updateSoundEffectVolume(Math.round((float)var3 * 1.27F));
				return 1;
			} else if (var0 == 3206) {
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Math.round((float)class4.clientPreferences.soundEffectsVolume / 1.27F);
				return 1;
			} else if (var0 == 3207) {
				var3 = Math.min(Math.max(Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize], 0), 100);
				NPCComposition.method2882(Math.round(1.27F * (float)var3));
				return 1;
			} else if (var0 == 3208) {
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Math.round((float)class4.clientPreferences.areaSoundEffectsVolume / 1.27F);
				return 1;
			} else {
				return 2;
			}
		}
	}
}
