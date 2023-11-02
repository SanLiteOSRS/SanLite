import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cj")
@Implements("ObjectSound")
public final class ObjectSound extends Node {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	@Export("objectSounds")
	static NodeDeque objectSounds;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1117438813
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1414439296
	)
	@Export("x")
	int x;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1824721511
	)
	@Export("y")
	int y;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1352569623
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1269826265
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 17843065
	)
	int field853;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -976838243
	)
	@Export("soundEffectId")
	int soundEffectId;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lbx;"
	)
	@Export("stream1")
	RawPcmStream stream1;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1835023265
	)
	int field860;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1270416119
	)
	int field862;
	@ObfuscatedName("aa")
	@Export("soundEffectIds")
	int[] soundEffectIds;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 109274549
	)
	int field864;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lbx;"
	)
	@Export("stream2")
	RawPcmStream stream2;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("obj")
	ObjectComposition obj;

	static {
		objectSounds = new NodeDeque(); // L: 11
	}

	ObjectSound() {
	} // L: 27

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("set")
	void set() {
		int var1 = this.soundEffectId; // L: 50
		ObjectComposition var2 = this.obj.transform(); // L: 51
		if (var2 != null) { // L: 52
			this.soundEffectId = var2.ambientSoundId; // L: 53
			this.field853 = var2.int7 * 128; // L: 54
			this.field860 = var2.int5; // L: 55
			this.field862 = var2.int6; // L: 56
			this.soundEffectIds = var2.soundEffectIds; // L: 57
		} else {
			this.soundEffectId = -1; // L: 60
			this.field853 = 0; // L: 61
			this.field860 = 0; // L: 62
			this.field862 = 0; // L: 63
			this.soundEffectIds = null; // L: 64
		}

		if (var1 != this.soundEffectId && this.stream1 != null) { // L: 66
			class140.pcmStreamMixer.removeSubStream(this.stream1); // L: 67
			this.stream1 = null; // L: 68
		}

	} // L: 70

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(ILds;ZB)I",
		garbageValue = "5"
	)
	static int method1955(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.CAM_FORCEANGLE) { // L: 4386
			Interpreter.Interpreter_intStackSize -= 2; // L: 4387
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4388
			int var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4389
			if (!Client.isCameraLocked) { // L: 4390
				Client.camAngleX = var3; // L: 4391
				Client.camAngleY = var4; // L: 4392
			}

			return 1; // L: 4394
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_XA) { // L: 4396
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.camAngleX; // L: 4397
			return 1; // L: 4398
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_YA) { // L: 4400
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.camAngleY; // L: 4401
			return 1; // L: 4402
		} else if (var0 == ScriptOpcodes.CAM_SETFOLLOWHEIGHT) { // L: 4404
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4405
			if (var3 < 0) { // L: 4406
				var3 = 0;
			}

			Client.camFollowHeight = var3; // L: 4407
			return 1; // L: 4408
		} else if (var0 == ScriptOpcodes.CAM_GETFOLLOWHEIGHT) { // L: 4410
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.camFollowHeight; // L: 4411
			return 1; // L: 4412
		} else {
			return 2; // L: 4414
		}
	}

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	static boolean method1952() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 1434
			while (Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 1435
				ArchiveLoader var0 = (ArchiveLoader)Client.archiveLoaders.get(Client.archiveLoadersDone); // L: 1436
				if (!var0.isLoaded()) { // L: 1437
					return false;
				}

				++Client.archiveLoadersDone; // L: 1438
			}

			return true; // L: 1440
		} else {
			return true; // L: 1439
		}
	}
}
