package pixelmon.battles.attacks.specialAttacks;

import java.util.ArrayList;

import pixelmon.battles.attacks.Attack;
import pixelmon.battles.attacks.statusEffects.StatusEffectBase;
import pixelmon.battles.attacks.statusEffects.StatusEffectType;
import pixelmon.entities.pixelmon.EntityPixelmon;

public class Facade extends SpecialAttackBase {

	public Facade() {
		super(SpecialAttackType.Facade, ApplyStage.During, false);
	}

	@Override
	public boolean ApplyEffect(EntityPixelmon user, EntityPixelmon target, Attack a, ArrayList<String> attackList, ArrayList<String> targetAttackList) throws Exception {
		a.baseAttack.basePower = 70;
		for (StatusEffectBase e : target.status) {
			if (e.type == StatusEffectType.Burn || e.type == StatusEffectType.Poison || e.type == StatusEffectType.PoisonBadly || e.type == StatusEffectType.Paralysis)
				a.baseAttack.basePower = 140;
		}
		return false;
	}
}
