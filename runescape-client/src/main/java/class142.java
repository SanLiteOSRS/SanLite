import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fa")
public class class142 {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		longValue = -7997171180678003627L
	)
	long field1661;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1818498225
	)
	int field1657;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	IterableNodeDeque field1658;

	@ObfuscatedSignature(
		descriptor = "(Lsg;)V"
	)
	public class142(Buffer var1) {
		this.field1657 = -1; // L: 9
		this.field1658 = new IterableNodeDeque(); // L: 10
		this.method3234(var1); // L: 28
	} // L: 29

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lsg;I)V",
		garbageValue = "-1541444446"
	)
	void method3234(Buffer var1) {
		this.field1661 = var1.readLong(); // L: 32
		this.field1657 = var1.readInt(); // L: 33

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) { // L: 34 35 55
			Object var3;
			if (var2 == 3) { // L: 37
				var3 = new class161(this);
			} else if (var2 == 1) { // L: 38
				var3 = new class137(this);
			} else if (var2 == 13) { // L: 39
				var3 = new class154(this);
			} else if (var2 == 4) { // L: 40
				var3 = new class146(this);
			} else if (var2 == 6) { // L: 41
				var3 = new class153(this);
			} else if (var2 == 5) { // L: 42
				var3 = new class138(this);
			} else if (var2 == 2) { // L: 43
				var3 = new class143(this);
			} else if (var2 == 7) { // L: 44
				var3 = new class136(this);
			} else if (var2 == 14) { // L: 45
				var3 = new class140(this);
			} else if (var2 == 8) { // L: 46
				var3 = new class157(this);
			} else if (var2 == 9) { // L: 47
				var3 = new class163(this);
			} else if (var2 == 10) {
				var3 = new class149(this); // L: 48
			} else if (var2 == 11) { // L: 49
				var3 = new class144(this);
			} else if (var2 == 12) { // L: 50
				var3 = new class148(this);
			} else {
				if (var2 != 15) { // L: 51
					throw new RuntimeException(""); // L: 52
				}

				var3 = new class158(this);
			}

			((class139)var3).vmethod3461(var1); // L: 53
			this.field1658.addFirst((Node)var3); // L: 54
		}

	} // L: 57

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lfj;B)V",
		garbageValue = "-52"
	)
	public void method3225(ClanSettings var1) {
		if (this.field1661 == var1.field1729 && this.field1657 == var1.field1712) { // L: 60
			for (class139 var2 = (class139)this.field1658.last(); var2 != null; var2 = (class139)this.field1658.previous()) { // L: 61
				var2.vmethod3458(var1); // L: 62
			}

			++var1.field1712; // L: 64
		} else {
			throw new RuntimeException("");
		}
	} // L: 65

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "6"
	)
	static int method3227() {
		return Rasterizer3D.field2514.field2802; // L: 118
	}

	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1215119663"
	)
	static final void method3235() {
		for (Projectile var0 = (Projectile)Client.projectiles.last(); var0 != null; var0 = (Projectile)Client.projectiles.previous()) { // L: 4804 4805 4822
			if (var0.plane == GameEngine.Client_plane && Client.cycle <= var0.cycleEnd) { // L: 4806
				if (Client.cycle >= var0.cycleStart) { // L: 4807
					if (var0.targetIndex > 0) { // L: 4808
						NPC var1 = Client.npcs[var0.targetIndex - 1]; // L: 4809
						if (var1 != null && var1.x >= 0 && var1.x < 13312 && var1.y >= 0 && var1.y < 13312) { // L: 4810
							var0.setDestination(var1.x, var1.y, class147.getTileHeight(var1.x, var1.y, var0.plane) - var0.endHeight, Client.cycle);
						}
					}

					if (var0.targetIndex < 0) { // L: 4812
						int var2 = -var0.targetIndex - 1; // L: 4814
						Player var3;
						if (var2 == Client.localPlayerIndex) { // L: 4815
							var3 = MusicPatchNode.localPlayer;
						} else {
							var3 = Client.players[var2]; // L: 4816
						}

						if (var3 != null && var3.x >= 0 && var3.x < 13312 && var3.y >= 0 && var3.y < 13312) {
							var0.setDestination(var3.x, var3.y, class147.getTileHeight(var3.x, var3.y, var0.plane) - var0.endHeight, Client.cycle); // L: 4817
						}
					}

					var0.advance(Client.field564); // L: 4819
					class31.scene.drawEntity(GameEngine.Client_plane, (int)var0.x, (int)var0.y, (int)var0.z, 60, var0, var0.yaw, -1L, false); // L: 4820
				}
			} else {
				var0.remove();
			}
		}

	} // L: 4824

	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "(Ldf;B)V",
		garbageValue = "76"
	)
	static void method3236(NPC var0) {
		var0.field1140 = var0.definition.size; // L: 8557
		var0.field1190 = var0.definition.rotation; // L: 8558
		var0.walkSequence = var0.definition.walkSequence; // L: 8559
		var0.walkBackSequence = var0.definition.walkBackSequence; // L: 8560
		var0.walkLeftSequence = var0.definition.walkLeftSequence; // L: 8561
		var0.walkRightSequence = var0.definition.walkRightSequence; // L: 8562
		var0.idleSequence = var0.definition.idleSequence; // L: 8563
		var0.field1136 = var0.definition.turnLeftSequence; // L: 8564
		var0.field1166 = var0.definition.turnRightSequence; // L: 8565
		var0.runSequence = var0.definition.field2048; // L: 8566
		var0.field1150 = var0.definition.field2008; // L: 8567
		var0.field1151 = var0.definition.field2025; // L: 8568
		var0.field1152 = var0.definition.field2037; // L: 8569
		var0.field1153 = var0.definition.field2023; // L: 8570
		var0.field1196 = var0.definition.field2028; // L: 8571
		var0.field1155 = var0.definition.field2029; // L: 8572
		var0.field1157 = var0.definition.field2030; // L: 8573
	} // L: 8574
}
