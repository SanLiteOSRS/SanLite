import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("az")
@Implements("WorldMapDecoration")
public class WorldMapDecoration {
	@ObfuscatedName("se")
	@ObfuscatedSignature(
		signature = "Lr;"
	)
	@Export("grandExchangeEvents")
	static GrandExchangeEvents grandExchangeEvents;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "Ldz;"
	)
	@Export("soundSystem")
	static SoundSystem soundSystem;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 573803167
	)
	@Export("objectDefinitionId")
	final int objectDefinitionId;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 502095041
	)
	@Export("decoration")
	final int decoration;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -81694959
	)
	@Export("rotation")
	final int rotation;

	WorldMapDecoration(int var1, int var2, int var3) {
		this.objectDefinitionId = var1;
		this.decoration = var2;
		this.rotation = var3;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "(IB)V",
		garbageValue = "7"
	)
	static void method428(int var0) {
		Login.loginIndex = 12;
		Login.field1216 = var0;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "(ILco;ZI)I",
		garbageValue = "-1847675306"
	)
	static int method429(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.SOUND_SYNTH) {
			MilliClock.Interpreter_intStackSize -= 3;
			KitDefinition.queueSoundEffect(Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize], Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 2]);
			return 1;
		} else if (var0 == ScriptOpcodes.SOUND_SONG) {
			Messages.playSong(Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]);
			return 1;
		} else if (var0 == ScriptOpcodes.SOUND_JINGLE) {
			MilliClock.Interpreter_intStackSize -= 2;
			Projectile.playSoundJingle(Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize], Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]);
			return 1;
		} else {
			return 2;
		}
	}
}
