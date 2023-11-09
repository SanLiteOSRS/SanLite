import java.io.IOException;
import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("er")
@Implements("PacketWriter")
public class PacketWriter {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1913648071
	)
	static int field1424;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	@Export("socket")
	AbstractSocket socket;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("packetBufferNodes")
	IterableNodeDeque packetBufferNodes;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1761871959
	)
	@Export("bufferSize")
	int bufferSize;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ltm;"
	)
	@Export("buffer")
	Buffer buffer;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lux;"
	)
	@Export("isaacCipher")
	public IsaacCipher isaacCipher;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lto;"
	)
	@Export("packetBuffer")
	PacketBuffer packetBuffer;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	@Export("serverPacket")
	ServerPacket serverPacket;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -218156893
	)
	@Export("serverPacketLength")
	int serverPacketLength;
	@ObfuscatedName("aa")
	boolean field1432;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 807217953
	)
	int field1435;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1043697015
	)
	@Export("pendingWrites")
	int pendingWrites;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	ServerPacket field1430;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	ServerPacket field1436;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	ServerPacket field1437;

	PacketWriter() {
		this.packetBufferNodes = new IterableNodeDeque(); // L: 15
		this.bufferSize = 0; // L: 16
		this.buffer = new Buffer(5000); // L: 17
		this.packetBuffer = new PacketBuffer(40000); // L: 19
		this.serverPacket = null; // L: 20
		this.serverPacketLength = 0; // L: 21
		this.field1432 = true; // L: 22
		this.field1435 = 0; // L: 23
		this.pendingWrites = 0; // L: 24
	} // L: 29

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1375263214"
	)
	@Export("clearBuffer")
	final void clearBuffer() {
		this.packetBufferNodes.rsClear(); // L: 32
		this.bufferSize = 0; // L: 33
	} // L: 34

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-55"
	)
	@Export("flush")
	final void flush() throws IOException {
		if (this.socket != null && this.bufferSize > 0) { // L: 37
			this.buffer.offset = 0; // L: 38

			while (true) {
				PacketBufferNode var1 = (PacketBufferNode)this.packetBufferNodes.last(); // L: 40
				if (var1 == null || var1.index > this.buffer.array.length - this.buffer.offset) { // L: 41 42
					this.socket.write(this.buffer.array, 0, this.buffer.offset); // L: 49
					this.pendingWrites = 0; // L: 50
					break;
				}

				this.buffer.writeBytes(var1.packetBuffer.array, 0, var1.index); // L: 43
				this.bufferSize -= var1.index; // L: 44
				var1.remove(); // L: 45
				var1.packetBuffer.releaseArray(); // L: 46
				var1.release(); // L: 47
			}
		}

	} // L: 52

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lly;B)V",
		garbageValue = "17"
	)
	@Export("addNode")
	public final void addNode(PacketBufferNode var1) {
		this.packetBufferNodes.addFirst(var1); // L: 55
		var1.index = var1.packetBuffer.offset; // L: 56
		var1.packetBuffer.offset = 0; // L: 57
		this.bufferSize += var1.index; // L: 58
	} // L: 59

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lqi;B)V",
		garbageValue = "-68"
	)
	@Export("setSocket")
	void setSocket(AbstractSocket var1) {
		this.socket = var1; // L: 62
	} // L: 63

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "272973129"
	)
	@Export("close")
	void close() {
		if (this.socket != null) { // L: 66
			this.socket.close(); // L: 67
			this.socket = null; // L: 68
		}

	} // L: 70

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1646741588"
	)
	@Export("removeSocket")
	void removeSocket() {
		this.socket = null; // L: 73
	} // L: 74

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Lqi;",
		garbageValue = "-972291242"
	)
	@Export("getSocket")
	AbstractSocket getSocket() {
		return this.socket; // L: 77
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZI)I",
		garbageValue = "899578863"
	)
	static int method2801(int var0, Script var1, boolean var2) {
		if (var0 < 1000) { // L: 429
			return Frames.method4719(var0, var1, var2);
		} else if (var0 < 1100) { // L: 430
			return SecureRandomFuture.method2162(var0, var1, var2);
		} else if (var0 < 1200) { // L: 431
			return class93.method2358(var0, var1, var2);
		} else if (var0 < 1300) { // L: 432
			return InterfaceParent.method2277(var0, var1, var2);
		} else if (var0 < 1400) { // L: 433
			return class12.method151(var0, var1, var2);
		} else if (var0 < 1500) { // L: 434
			return class169.method3363(var0, var1, var2);
		} else if (var0 < 1600) { // L: 435
			return class132.method3045(var0, var1, var2);
		} else if (var0 < 1700) { // L: 436
			return WorldMapRectangle.method5479(var0, var1, var2);
		} else if (var0 < 1800) { // L: 437
			return DynamicObject.method2186(var0, var1, var2);
		} else if (var0 < 1900) { // L: 438
			return SecureRandomFuture.method2166(var0, var1, var2);
		} else if (var0 < 2000) { // L: 439
			return class499.method8897(var0, var1, var2);
		} else if (var0 < 2100) { // L: 440
			return SecureRandomFuture.method2162(var0, var1, var2);
		} else if (var0 < 2200) { // L: 441
			return class93.method2358(var0, var1, var2);
		} else if (var0 < 2300) { // L: 442
			return InterfaceParent.method2277(var0, var1, var2);
		} else if (var0 < 2400) { // L: 443
			return class12.method151(var0, var1, var2);
		} else if (var0 < 2500) { // L: 444
			return class169.method3363(var0, var1, var2);
		} else if (var0 < 2600) { // L: 445
			return MenuAction.method2084(var0, var1, var2);
		} else if (var0 < 2700) { // L: 446
			return ByteArrayPool.method7681(var0, var1, var2);
		} else if (var0 < 2800) { // L: 447
			return class326.method6059(var0, var1, var2);
		} else if (var0 < 2900) { // L: 448
			return Player.method2354(var0, var1, var2);
		} else if (var0 < 3000) { // L: 449
			return class499.method8897(var0, var1, var2);
		} else if (var0 < 3200) { // L: 450
			return class466.method8373(var0, var1, var2);
		} else if (var0 < 3300) { // L: 451
			return WorldMapSection1.method5524(var0, var1, var2);
		} else if (var0 < 3400) { // L: 452
			return class372.method6930(var0, var1, var2);
		} else if (var0 < 3500) { // L: 453
			return NameableContainer.method7990(var0, var1, var2);
		} else if (var0 < 3600) { // L: 454
			return class238.method4766(var0, var1, var2);
		} else if (var0 < 3700) { // L: 455
			return class16.method206(var0, var1, var2);
		} else if (var0 < 3800) { // L: 456
			return class31.method461(var0, var1, var2);
		} else if (var0 < 3900) { // L: 457
			return ObjectSound.method1930(var0, var1, var2);
		} else if (var0 < 4000) { // L: 458
			return GameBuild.method6608(var0, var1, var2);
		} else if (var0 < 4100) {
			return class352.method6623(var0, var1, var2); // L: 459
		} else if (var0 < 4200) { // L: 460
			return Decimator.method1133(var0, var1, var2);
		} else if (var0 < 4300) { // L: 461
			return AttackOption.method2672(var0, var1, var2);
		} else if (var0 < 5100) { // L: 462
			return ArchiveDiskActionHandler.method6645(var0, var1, var2);
		} else if (var0 < 5400) { // L: 463
			return class161.method3288(var0, var1, var2);
		} else if (var0 < 5600) { // L: 464
			return class466.method8376(var0, var1, var2);
		} else if (var0 < 5700) { // L: 465
			return Interpreter.method2067(var0, var1, var2);
		} else if (var0 < 6300) { // L: 466
			return class448.method8160(var0, var1, var2);
		} else if (var0 < 6600) { // L: 467
			return class139.method3084(var0, var1, var2);
		} else if (var0 < 6700) { // L: 468
			return Interpreter.method2068(var0, var1, var2);
		} else if (var0 < 6800) { // L: 469
			return class101.method2642(var0, var1, var2);
		} else if (var0 < 6900) { // L: 470
			return class183.method3546(var0, var1, var2);
		} else if (var0 < 7000) { // L: 471
			return class53.method1098(var0, var1, var2);
		} else if (var0 < 7100) { // L: 472
			return class6.method38(var0, var1, var2);
		} else if (var0 < 7200) { // L: 473
			return Messages.method2771(var0, var1, var2);
		} else if (var0 < 7300) { // L: 474
			return class170.method3441(var0, var1, var2);
		} else if (var0 < 7500) {
			return InterfaceParent.method2276(var0, var1, var2);
		} else if (var0 < 7600) {
			return SoundCache.method884(var0, var1, var2);
		} else if (var0 < 7700) {
			return class178.method3504(var0, var1, var2);
		} else {
			return var0 < 8100 ? class218.method4244(var0, var1, var2) : 2;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "49"
	)
	public static void method2806(int var0, int var1, int var2, int var3) {
		if (class305.field3404.size() > 1 && class305.field3404.get(0) != null && ((class317)class305.field3404.get(0)).field3517.isReady() && class305.field3404.get(1) != null && ((class317)class305.field3404.get(1)).field3517.isReady()) { // L: 118
			class270.method5491(var0, var1, var2, var3); // L: 119
			class305.field3406.add(new class400((class406)null)); // L: 120
			ArrayList var4 = new ArrayList(); // L: 121
			var4.add(new class402(new class405((class406)null, 1, false, class305.field3401), class305.field3410)); // L: 122
			var4.add(new class402(new class404((class406)null, 0, false, class305.field3409), class305.field3408)); // L: 123
			class305.field3406.add(new class407((class406)null, var4)); // L: 124
			if (class305.field3405.get(0) != null && class305.field3405.get(1) != null) { // L: 125
				class317 var5 = (class317)class305.field3405.get(0); // L: 126
				class305.field3405.set(0, class305.field3404.get(1)); // L: 127
				class305.field3405.set(1, var5); // L: 128
			}
		}

	} // L: 131

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-581625069"
	)
	protected static final void method2798() {
		class332.clock.mark(); // L: 475

		int var0;
		for (var0 = 0; var0 < 32; ++var0) { // L: 476
			GameEngine.graphicsTickTimes[var0] = 0L;
		}

		for (var0 = 0; var0 < 32; ++var0) { // L: 477
			GameEngine.clientTickTimes[var0] = 0L;
		}

		GameEngine.gameCyclesToDo = 0; // L: 478
	} // L: 479

	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "(Ldv;I)V",
		garbageValue = "-932722306"
	)
	static final void method2805(PendingSpawn var0) {
		long var1 = 0L; // L: 8431
		int var3 = -1; // L: 8432
		int var4 = 0; // L: 8433
		int var5 = 0; // L: 8434
		if (var0.type == 0) { // L: 8435
			var1 = class130.scene.getWallObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 1) { // L: 8436
			var1 = class130.scene.getDecorativeObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 2) { // L: 8437
			var1 = class130.scene.getGameObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 3) { // L: 8438
			var1 = class130.scene.getGroundObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var1 != 0L) { // L: 8439
			int var6 = class130.scene.getObjectFlags(var0.plane, var0.x, var0.y, var1); // L: 8440
			var3 = InvDefinition.Entity_unpackID(var1); // L: 8441
			var4 = var6 & 31; // L: 8442
			var5 = var6 >> 6 & 3; // L: 8443
		}

		var0.objectId = var3; // L: 8445
		var0.field1186 = var4; // L: 8446
		var0.field1185 = var5; // L: 8447
	} // L: 8448
}
